
var articles = Vue.component('app-article', function(resolve, reject){
    $.get("../../templates/admin/article_list.html").then(function(res){
        resolve({
            template: res,
            data: function(){
                var _that = this;
                return {
                    articles: [],
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
                    $('#pageLimit').bootstrapPaginator(this.pageinfo);
                },
                getarticles: function(page, limit){
                    debugger;
                    var params = {
                        "page": page,
                        "limit": limit
                    };
                    var url = '/wantrip/article/pages';
                    var user_token = getCookie("user_token");
                    var _this = this;
                    _this.articles = [];
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
                            if(data){
                                //设置分页信息
                                _this.pageinfo.currentPage = data.payload.pageNum;
                                _this.pageinfo.totalPages = data.payload.pages;
                              //  _this.pageinfo.totalPages = 10;
                                for(var i=0; i<data.payload.list.length; i++){
                                    _this.articles.push(data.payload.list[i]);
                                }
                               _this.initpage();
                            }
                        },
                        error: function(data){

                        }
                    });
                }
            },
            mounted: function () {
                this.getarticles(1, 3);
                this.initpage();
            }
        });
    });
});
