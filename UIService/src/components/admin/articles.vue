<template>
    <div class="content-page">
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <h4 class="page-title">文章管理</h4>
                    </div>
                    <div class="col-md-12">
                        <table class="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th width="35%">文章标题</th>
                                <th width="15%">发布时间</th>
                                <th>浏览量</th>
                                <th>所属分类</th>
                                <th width="8%">发布状态</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td><a href="#">我是文章标题</a></td>
                                <td>2018-01-13 12:23:58</td>
                                <td>12</td>
                                <td>默认分类</td>
                                <td><span class="label label-success">已发布</span></td>
                                <td>
                                    <a href="#" class="btn btn-primary btn-sm waves-effect waves-light m-b-5">
                                        <i class="fa fa-edit"></i><span> 编辑</span>
                                    </a>
                                    <a href="#" class="btn btn-danger btn-sm waves-effect waves-light m-b-5">
                                        <i class="fa fa-trash-o"></i><span> 删除</span>
                                    </a>
                                    <a href="#" class="btn btn-warning btn-sm waves-effect waves-light m-b-5">
                                        <i class="fa fa-rocket"></i><span> 预览</span>
                                    </a>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    export default {
        name: 'Articles',
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
