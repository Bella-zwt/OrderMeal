var url = decodeURI(location.search);
var info=url.split("=");
var FOODNAME=info[1].split("&")[0];
var foodId=info[2].split("&")[0];
var FOODPRICE=info[3].split("&")[0];
var MEMBERPRICE=info[4].split("&")[0];
var TYPENAME=info[5].split("&")[0]
var FOODINFO=info[6].split("&")[0];
var FOODIMG=info[7];


var Main = {
	data() {
		return {
			textarea: FOODINFO,
			options: [],
			value: "",
			input1: FOODNAME,
			input2: FOODPRICE,
			input3: MEMBERPRICE,
			fileList: [{
				url:FOODIMG
			}],
			file:{},
			myheader:{
				"Content-Type":"multipart/form-data"
			},
			typeID:0,
			filePath:FOODIMG,
			isSuccess:false
		}
	},
	created:function(){
	  	  this.getOptions();
		},
	methods: {
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
  	    for(var k=0;k<self.options.length;k++){
  	    	if(TYPENAME==self.options[k].label){
  	    		self.value=self.options[k].value;
  	    		self.typeID=self.options[k].value;
  	    	}
  	    }
  	  })
  	  .catch(function (error) {
  	    // handle error
  	    console.log("error:"+error);
  	  });
    },
    getTypeID(event){
  	  this.typeID=event;
    },
    handleRemove(file, fileList) {
		//console.log(file, fileList);
	},
	handlePreview(file) {
		//console.log(file);
	},
	handleChange(file, fileList) {
		//console.log(file);
	    this.file=file;
	    this.isSuccess=true;
	},
	handleSuccess(response, file, fileList){
    	//console.log(response);
    	this.filePath=response.filePath;
    	//console.log(this.filePath);
    	var input1=document.getElementById("input1");
		var input2=document.getElementById("input2");
		var input3=document.getElementById("input3");
		var textarea=document.getElementById("textarea");
		var self=this;
		axios.post('http://localhost/OrderMeal/food/updateFood', {
			foodId:foodId,
			foodImg:self.filePath,
		    foodName:input1.value,
		    foodPrice:input2.value*1,
		    memberPrice:input3.value*1,
		    typeId:self.typeID,
		    foodInfo:textarea.value
		  })
		  .then(function (response) {
			  window.history.back(-1);
		  })
		  .catch(function (error) {
		    console.log(error);
		  });
    },
	backpage(){
    	if(this.isSuccess==true){
    		this.$refs.upload.submit();
    	}else{
    		var input1=document.getElementById("input1");
    		var input2=document.getElementById("input2");
    		var input3=document.getElementById("input3");
    		var textarea=document.getElementById("textarea");
    		var self=this;
    		axios.post('http://localhost/OrderMeal/food/updateFood', {
    			foodId:foodId,
    			foodImg:self.filePath,
    		    foodName:input1.value,
    		    foodPrice:input2.value*1,
    		    memberPrice:input3.value*1,
    		    typeId:self.typeID,
    		    foodInfo:textarea.value
    		  })
    		  .then(function (response) {
    			  window.history.back(-1);
    		  })
    		  .catch(function (error) {
    		    console.log(error);
    		  });
    	}
	}
	}
}
var Ctor = Vue.extend(Main)
new Ctor().$mount('#app')

