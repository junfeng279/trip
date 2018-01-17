<template>
    <div class="content-page">
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <h4 class="page-title">仪表盘</h4>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-lg-3">
                            <div class="mini-stat clearfix bx-shadow bg-info">
                                <span class="mini-stat-icon"><i class="fa fa-quote-right" aria-hidden="true"></i></span>
                                <div class="mini-stat-info text-right">
                                    发表了<span class="counter">10</span>篇文章
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-3">
                            <div class="mini-stat clearfix bg-purple bx-shadow">
                                <span class="mini-stat-icon"><i class="fa fa-comments-o" aria-hidden="true"></i></span>
                                <div class="mini-stat-info text-right">
                                    收到了<span class="counter">25</span>条留言
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-3">
                            <div class="mini-stat clearfix bx-shadow bg-success">
                                <span class="mini-stat-icon"><i class="fa fa-cloud-upload" aria-hidden="true"></i></span>
                                <div class="mini-stat-info text-right">
                                    上传了<span class="counter">23</span>个附件
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-3">
                            <div class="mini-stat clearfix bx-shadow bg-primary">
                                <span class="mini-stat-icon"><i class="fa fa-link" aria-hidden="true"></i></span>
                                <div class="mini-stat-info text-right">
                                    友链了<span class="counter">78</span>个好友
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">最新文章</h4>
                                </div>
                                <div class="panel-body">
                                    <ul class="list-group">
                                        <li class="list-group-item text-left">
                                            <span class="badge badge-primary">3条评论</span>
                                            <a class="" href="#">我是测试的</a>
                                        </li>
                                        <li class="list-group-item text-left">
                                            <span class="badge badge-primary">12条评论</span>
                                            <a class="" href="#">我是测试的2</a>
                                        </li>
                                        <li class="list-group-item text-left">
                                            <span class="badge badge-primary">23条评论</span>
                                            <a class="" href="#">我是测试的3</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">最新留言</h3>
                                </div>
                                <div class="panel-body">
                                    <ul class="list-group">
                                        <li class="list-group-item">
                                            <a href="#">junfeng279</a>
                                            于 2018-01-13 23:23:34
                                            <a href="#">我是</a>
                                        </li>
                                        <li class="list-group-item">
                                            <a href="#">junfeng279</a>
                                            于 2018-01-13 23:23:34
                                            <a href="#">我是</a>
                                        </li>
                                        <li class="list-group-item">
                                            <a href="#">junfeng279</a>
                                            于 2018-01-13 23:23:34
                                            <a href="#">我是</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">系统日志</h3>
                                </div>
                                <div class="panel-body">
                                    <ul class="list-group">
                                        <li class="list-group-item">
                                            <span>2018-01-13 23:12:48 => 发表了评论</span>
                                        </li>
                                        <li class="list-group-item">
                                            <span>2018-01-13 23:12:48 => 发表了评论</span>
                                        </li>
                                        <li class="list-group-item">
                                            <span>2018-01-13 23:12:48 => 发表了评论</span>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    export default {
        name: 'Dashboard',
        data: function () {
            return {

            };
        }
    };

</script>
<style>
    @import "../../static/css/bootstrap.css";
    @import "../../static/css/font-awesome.css";
    @import "../../static/css/style.min.css";
</style>
