<template>
    <div class="content-page">
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <h4 class="page-title">页面管理</h4>
                    </div>
                    <div class="col-md-12">
                        <div class="pull-right">
                            <router-link to="/index/pageEdit" class="btn btn-success waves-effect waves-light m-b-5">添加新页面</router-link>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <table class="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th>页面名称</th>
                                <th>页面路径</th>
                                <th width="20%">发布时间</th>
                                <th width="12%">发布状态</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>我是页面名称</td>
                                <td>www.baidu.com</td>
                                <td>2018-01-14 12:57:54</td>
                                <td>草稿</td>
                                <td>
                                    <a class="btn btn-primary btn-sm waves-effect waves-light">
                                        <i class="fa fa-edit"></i><span> 编辑</span>
                                    </a>
                                    <a class="btn btn-danger btn-sm waves-effect waves-light">
                                        <i class="fa fa-trash-o"></i><span> 删除</span>
                                    </a>
                                    <a class="btn btn-warning btn-sm waves-effect waves-light">
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
        name: 'Pages',
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
