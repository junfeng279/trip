var comments = Vue.component('app-comment', function(resolve, reject){
    $.get("../../templates/admin/comment_list.html").then(function(res){
        resolve({
            template: res,
            data: function(){
                var _that = this;
                return {
                    comments: [],
                    pageinfo:{
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
                        },
                        onPageChanged:function (event, originalEvent, typePage, currentPage){
                            _that.getarticles(typePage, 3);
                        }
                    }
                }
            },
            methods: {
                initpage: function(){
                    //初始化分页
                    $('#pageLimit').bootstrapPaginator(this.pageinfo);
                },
                getComments: function(){
                    //分页参数
                    var params = {
                        "page": page,
                        "limit": limit
                    };
                    var url = '/wantrip/article/pages';
                    var user_token = getCookie("user_token");
                    var _this = this;
                    _this.articles = [];
                }
            }
        });
    });
});