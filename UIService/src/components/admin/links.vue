<template>
    <div class="content-page">
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <h4 class="page-title">友链管理</h4>
                    </div>
                    <div class="col-md-12">
                        <table class="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th>链接名称</th>
                                <th>链接地址</th>
                                <th>链接LOGO</th>
                                <th>链接排序</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>我是链接</td>
                                <td><a href="#">www.baidu.com</a></td>
                                <td>描述</td>
                                <td>sort 排序</td>
                                <td>
                                    <a href="#" class="btn btn-primary btn-sm waves-effect waves-light m-b-5">
                                        <i class="fa fa-edit"></i><span> 编辑</span>
                                    </a>
                                    <a href="#" class="btn btn-danger btn-sm waves-effect waves-light m-b-5">
                                        <i class="fa fa-trash-o"></i><span> 删除</span>
                                    </a>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="row">
                        <div class="col-md-12" style="padding: 20px;">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">保存友链</h3>
                                </div>
                                <div class="panel-body">
                                    <form class="form-inline" role="form" novalidate="novalidate">
                                        <div class="form-group">
                                            <label class="sr-only">链接标题</label>
                                            <input type="text" class="form-control" placeholder="请输入链接标题..."
                                            required="required" aria-required="true" />
                                        </div>
                                        <div class="form-group">
                                            <label class="sr-only">链接URL</label>
                                            <input type="text" class="form-control" placeholder="请输入链接地址..."
                                                   required="required" aria-required="true" />
                                        </div>
                                        <div class="form-group">
                                            <label class="sr-only">链接LOGO</label>
                                            <input type="text" class="form-control" placeholder="请输入链接LOGO, 没有则不输入..."
                                                   required="required" aria-required="true" />
                                        </div>
                                        <div class="form-group">
                                            <label class="sr-only">链接排序</label>
                                            <input type="number" class="form-control"  value="0"/>
                                        </div>
                                        <button type="button" class="btn btn-success waves-effect waves-light m-l-10">保存链接</button>
                                    </form>
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
        name: 'Links',
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
