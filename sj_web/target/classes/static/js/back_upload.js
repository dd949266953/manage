<!--获取图片名称 data:file的名字-->
function getImgName(data) {
    var name = $(".img-div[data='" + data + "']").find("img").attr("alt");
    return name;
}

//验证是否上传成功  1成功 -1失败
var pass = 1;
layui.use('upload', function () {
    var $ = layui.jquery,
        upload = layui.upload;
    //多图片上传
    upload.render({
        elem: '.layui-upload',
        url: '/Community/upload/',
        field: 'file',
        choose: function (obj) {
            //将每次选择的文件追加到文件队列
            var touchObj = this.item[0].attributes[1].nodeValue;
            //预读本地文件示例，不支持ie8
            obj.preview(function (index, file, result) {
                $('.img-div[data="' + touchObj + '"]').append('<img src="' + result + '" alt="' + file.name +
                    '" class="layui-upload-img img" height="86px" width="86px">'
                )
                $('.img-div[data="' + touchObj + '"]').find('.upload-before').hide();
            });
        },

    });
    //控制图片遮罩隐藏显示
    $(".img-div").hover(
        function () {
            if ($(this).find('img').length != 0) {
                $(this).find(".upload-after").show();
            }
            $(this).css("border", "1px solid #999");
        },
        function () {
            $(this).css("border", "1px dashed #999");
            $(this).find(".upload-after").hide();
        }
    )
    //查看图片
    $(".look").click(function (event) {
        event.stopPropagation();
    })
    //删除图片
    $(".del").click(function (event) {
        var dom = $(this).parents(".img-div");
        dom.find("img").remove();
        dom.find(".upload-before").show().removeClass('hide');
        dom.find(".upload-after").hide();
        event.stopPropagation();
    })
});

layui.use(['layer', 'form'], function () { //独立版的layer无需执行这一句
    var $ = layui.jquery,
        layer = layui.layer; //独立版的layer无需执行这一句
    var form = layui.form;

    //触发事件
    var active = {
        offset: function (othis) {
            var type = othis.data('type'),
                text = othis.text();
            var obj = $(othis);
            var data = obj.attr('data');
            layer.open({
                type: 1,
                title: false,
                scrollbar: false,
                shadeClose: true,
                closeBtn: 0,
                offset: type,
                area: ['512px', '306px'],
                content: $('.photo'),
                btnAlign: 'c' //按钮居中
                ,
                shade: [0.7, '#080808'],
                yes: function () {
                    layer.closeAll();
                }
            });
        }
    };

    $('#layerDemo .layui-btn').on('click', function () {
        //获取当前上传图片的路径
        var path = $(this).parent().siblings("img").attr("src");
        var img = $('<img src="' + path + '" height="266px" width="472px" />');
        $(".photo").append(img);
        var othis = $(this),
            method = othis.data('method');
        active[method] ? active[method].call(this, othis) : '';
    });

});
