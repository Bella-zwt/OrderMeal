var Main = {
  data() {
    return {
      input1: '',
    }
  },
  methods:{
	  addType(){
		  var input1=document.getElementById("input1");
		  var self=this;
	    	axios.post('http://localhost/OrderMeal/foodtype/addType', {
	    		typeName:input1.value
			  })
			  .then(function (response) {
				  input1.value="";
			  })
			  .catch(function (error) {
			    console.log(error);
			  });
	  }
  }
}
var Ctor = Vue.extend(Main)
new Ctor().$mount('#app')