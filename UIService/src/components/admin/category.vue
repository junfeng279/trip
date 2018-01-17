<template>
    <div class="content-page">
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <h4 class="page-title">分类/标签管理</h4>
                    </div>
                    <div class="col-md-6">
                        <div class="panel panel-color panel-primary">
                            <div class="panel-heading">
                                <h1 class="panel-title">分类列表</h1>
                            </div>
                            <div class="panel-body">
                                <div class="btn-group m-b-10">
                                    <button type="button" class="btn btn-warning dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="false">
                                        电脑(20)
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu" role="menu">
                                        <li>
                                            <a href="#" class="edit-category">修改</a>
                                        </li>
                                        <li>
                                            <a href="#" class="del-category">删除</a>
                                        </li>
                                    </ul>
                                </div>
                                <div class="btn-group m-b-10">
                                    <button type="button" class="btn btn-danger dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="false">
                                        手机(28)
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu" role="menu">
                                        <li>
                                            <a href="#" class="edit-category">修改</a>
                                        </li>
                                        <li>
                                            <a href="#" class="del-category">删除</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="panel panel-color panel-pink">
                            <div class="panel-heading">
                                <h1 class="panel-title">标签列表</h1>
                            </div>
                            <div class="panel-body">
                                <div class="btn-group m-b-10">
                                    <button type="button" class="btn btn-primary dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="false">
                                        电影(20)
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu" role="menu">
                                        <li>
                                            <a href="#" class="edit-category">修改</a>
                                        </li>
                                        <li>
                                            <a href="#" class="del-category">删除</a>
                                        </li>
                                    </ul>
                                </div>
                                <div class="btn-group m-b-10">
                                    <button type="button" class="btn btn-warning dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="false">
                                        奇幻(28)
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu" role="menu">
                                        <li>
                                            <a href="#" class="edit-tag">修改</a>
                                        </li>
                                        <li>
                                            <a href="#" class="del-tag">删除</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="panel panel-default">
                            <div class="panel-body text-left">
                                <form class="form-inline" role="form">
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="请输入分类名称" />
                                    </div>
                                    <button id="save-category-btn" type="button" class="btn btn-success waves-effect waves-light m-l-10">
                                        保存分类
                                    </button>
                                </form>
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
        name: 'Category',
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
