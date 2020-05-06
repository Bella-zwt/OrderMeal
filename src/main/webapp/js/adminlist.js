var Main = {
      data() {
        return {
          tableData: []
        }
      },
      created:function(){
    	  this.getTableData();
  	},
      methods:{
    	  getTableData(){
    		  var self=this;
    		  axios.get('http://localhost/OrderMeal/admin/show').then(function (response) {
    	    // handle success
    	    console.log(response.data);
    	    self.tableData=response.data.admins;
    	    console.log(self.tableData);
    	  })
    	  .catch(function (error) {
    	    // handle error
    	    console.log("error:"+error);
    	  });
      }
      }
    }
var Ctor = Vue.extend(Main)
new Ctor().$mount('#app')