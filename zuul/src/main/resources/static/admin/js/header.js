
var header = Vue.component('app-header', function(resolve, reject){
    $.get("../../templates/admin/header.html").then(function(res){
        resolve({
            props: ['myMessage'],
            template: res,
            data: function(){
                return {
                    sidemenu: {
                        home: "仪表盘",
                        publishs: "发布文章",
                        articles: "文章管理",
                        page: "页面管理",
                        comments: "评论管理",
                        category: "分类/标签",
                        attach: "文件管理",
                        links: "链接管理",
                        setting: "系统设置"
                    },
                    isActive: "home"
                }
            },
            methods: {
                menuclick: function(data){
                    this.isActive = data;
                    this.$emit("menuclick", data);
                }
            }
        });
    });
});