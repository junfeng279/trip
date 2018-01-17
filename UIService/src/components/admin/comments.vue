<template>
    <div class="content-page">
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <h4 class="page-title">评论管理</h4>
                    </div>
                    <div class="col-md-12">
                        <table class="table table-striped table-bordered">
                            <thead>
                            <tr>
                                <th>评论内容</th>
                                <th>评论人</th>
                                <th>评论时间</th>
                                <th>评论人邮箱</th>
                                <th>评论人网址</th>
                                <th>评论状态</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td><a href="#">我是评论内容</a></td>
                                <td>junfeng</td>
                                <td>2018-12-39 23:59:59</td>
                                <td>junfeng279@163.com</td>
                                <td>www.baidu.com</td>
                                <td><span class="label label-success">审核通过</span></td>
                                <td>
                                    <a href="#" class="btn btn-success btn-sm waves-effect waves-light">
                                        <i class="fa fa-cog fa-spin"></i><span> 通过</span>
                                    </a>
                                    <a href="#" class="btn btn-danger btn-sm waves-effect waves-light">
                                        <i class="fa fa-trash-o"></i><span> 删除</span>
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
        name: 'Comments',
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
