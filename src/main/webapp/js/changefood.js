var Main = {
	data() {
		return {
			tableData: []
		}
	},
	created:function(){
		this.getTableData();
	},
	methods: {
		getTableData(){
	  		  var self=this;
	  		  axios.get('http://localhost/OrderMeal/food/showFood').then(function (response) {
	  	    // handle success
	  	    console.log(response.data.foodtype);
	  	    self.tableData=response.data.foodtype;
	  	    console.log(self.tableData);
	  	  })
	  	  .catch(function (error) {
	  	    // handle error
	  	    console.log("error:"+error);
	  	  });
		changetext(index, row) {
			console.log(index, row)
			window.location.href="/OrderMeal/iframe/changefoodDetail"+"?row.foodName="+row.foodName+"&row.foodId="+row.foodId+"&row.foodPrice="+row.foodPrice+"&row.memberPrice="+row.memberPrice+"&row.typeId="+row.typeId+"&row.foodInfo="+row.foodInfo+"&row.foodImg="+row.foodImg;
		}
	}
}
var Ctor = Vue.extend(Main)
new Ctor().$mount('#app')