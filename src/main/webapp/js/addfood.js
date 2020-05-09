var Main = {
	data() {
		return {
			file:{},
			textarea: '',
			options: [],
			value: '',
			input1: '',
			input2: '',
			input3: '',
			fileList: [],
			myheader:{
				"Content-Type":"multipart/form-data"
			},
			typeID:0,
			filePath:""
		}
	},
    created:function(){
    	  this.getOptions();
  	},
      methods:{
    	  getOptions(){
    		  var self=this;
    		  axios.get('http://localhost/OrderMeal/foodtype/showType').then(function (response) {
    	    // handle success
    	    console.log(response.data.foodtype);
    	    for(var i=0;i<response.data.foodtype.length;i++){
    	    	var temp=response.data.foodtype[i].typeId;
    	    	delete(response.data.foodtype[i].typeId);
    	    	response.data.foodtype[i].value=temp;
    	    	var temp1=response.data.foodtype[i].typeName;
    	    	delete(response.data.foodtype[i].typeName);
    	    	response.data.foodtype[i].label=temp1;
    	    }
    	    self.options=response.data.foodtype;
    	  })
    	  .catch(function (error) {
    	    // handle error
    	    console.log("error:"+error);
    	  });
      },
      getTypeID(event){
    	  console.log(event);
    	  this.typeID=event;
      },
      handleRemove(file, fileList) {
			console.log(file, fileList);
		},
		handlePreview(file) {
			console.log(file);
		},
		handleChange(file, fileList) {
	        console.log(file);
	        this.file=file;
	    },
	    handleSuccess(response, file, fileList){
	    	console.log(response);
	    	this.filePath=response.filePath;
	    	var input1=document.getElementById("input1");
			// console.log(input1.value);
			var input2=document.getElementById("input2");
			// console.log(input2.value);
			var input3=document.getElementById("input3");
			var textarea=document.getElementById("textarea");
			var self=this;
			axios.post('http://localhost/OrderMeal/food/addFood', {
				foodImg:self.filePath,
			    foodName:input1.value,
			    foodPrice:input2.value*1,
			    memberPrice:input3.value*1,
			    typeId:self.typeID,
			    foodInfo:textarea.value
			  })
			  .then(function (response) {
				  input1.value="";
				  input2.value="";
				  input3.value="";
				  textarea.value="";
				  self.filePath=[];
			  })
			  .catch(function (error) {
			    console.log(error);
			  });
	    },
		upload(response,file,fileList){
			console.log(file);
		},
		submit(){
			this.$refs.upload.submit();
		}
      }
}
var Ctor = Vue.extend(Main)
new Ctor().$mount('#app')
