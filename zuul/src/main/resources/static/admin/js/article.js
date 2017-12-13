
var articles = Vue.component('app-article', function(resolve, reject){
    $.get("../../templates/admin/article_list.html").then(function(res){
        resolve({
            template: res,
            data: function(){
                return {
                    articles: []
                }
            },
            methods: {
                initpage: function(){
                    $('#pageLimit').bootstrapPaginator({
                        currentPage: 1,//当前的请求页面。
                        totalPages: 20,//一共多少页。
                        size:"normal",//应该是页眉的大小。
                        bootstrapMajorVersion: 3,//bootstrap的版本要求。
                        alignment:"right",
                        numberOfPages:5,//一页列出多少数据。
                        itemTexts: function (type, page, current) {//如下的代码是将页眉显示的中文显示我们自定义的中文。
                            switch (type) {
                                case "first": return "首页";
                                case "prev": return "上一页";
                                case "next": return "下一页";
                                case "last": return "末页";
                                case "page": return page;
                            }
                        }
                     });
                },
                getarticles: function(){
                    var params = {
                        "page": 0,
                        "limit": 20
                    };
                    var url = '/wantrip/article/pages';
                    var user_token = getCookie("user_token");
                    var _this = this;
                    $.ajax({
                        url: url,
                        type: "POST",
                        dataType: "json",
                        data: JSON.stringify(params),
                        contentType: 'application/json',
                        headers: {
                            'Authorization': 'Bearer '+user_token
                        },
                        success: function(data){
                            debugger;
                            if(data){
                                for(var i=0; i<data.payload.list.length; i++){
                                    _this.articles.push(data.payload.list[i]);
                                }
                            }
                        },
                        error: function(data){

                        }
                    });
                }
            },
            mounted: function () {
                this.getarticles();
                this.initpage();
            }
        });
    });
});
