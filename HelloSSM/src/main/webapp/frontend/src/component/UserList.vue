<template>
            <div class="panel">
                <!-- Default panel contents -->
                <div class="panel-heading">用户列表</div>
                <!-- Table -->
                <table id ="user_tb" class="table">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>User Name</th>
                        <th>Password</th>
                        <th>Delete</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr v-for="user in userList" :key="user">
                        <td>{{user.id}}</td>
                        <td>{{user.userName}}</td>
                        <td>{{user.password}}</td>
                        <td><button class ="button is-primary" v-on:click="deleteUser(user.id)">Del</button></td>
                    </tr>
                    </tbody>
                </table>
            </div>
</template>

<script>
import Axios from 'axios';
import 'bulma/css/bulma.css';

export default {
    data(){
        return {userList:[]}
    },
    mounted(){
         Axios.get("http://localhost:8081/HelloSSM/rest/user/").then(response=>{
      console.log(response);
      this.userList = response.data;
    })
    },
    methods:{
        deleteUser:function(id){
             console.log("deleteUser :: id = ",id);
             Axios.delete("http://localhost:8081/HelloSSM/rest/user/"+id).then(response=>{
                console.log(response);
             });
        }
    }
    
}
</script>

<style>

</style>
