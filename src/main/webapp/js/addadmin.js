var Main = {
  data() {
    return {
      input1: '',
      input2: ''
    }
  },
  methods:{
	  addAdmin(){
		  var input1=document.getElementById("input1");
		  var input2=document.getElementById("input2");
		  axios.post('http://localhost/OrderMeal/admin/addAdmin', {
				username:input1.value,
				password:input2.value
			  })
			  .then(function (response) {
				  input1.value="";
				  input2.value="";
			  })
			  .catch(function (error) {
			    console.log(error);
			  });
	  }
  }
}
var Ctor = Vue.extend(Main)
new Ctor().$mount('#app')