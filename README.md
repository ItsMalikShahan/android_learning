# android_learning
In this repository, i will do my daily base android task and also update it with day by day activity.<br>
<h1>17/11/2023</h1><br>
Transfer data from one fragment to another fragment using factory method and creating interface in fragments.<br>
<h1>18/11/2023</h1><br>
<h4>Transfer of data using view model class</h4><br>
In fragment lifecycle we have onCreate(), onCreateView(), onDestroyView and onDestroy.<br>
Generally when we make transaction from one fragment to another it keep instance of data and <br>
UI(onDestroyView()) is destroyed. and when we press back it create same UI(onCreateVIew()) using<br>
instance.<br> <br>
In case of View Model live data keep tract of observer and in normal case instance remain the same and <br>
recreate the same UI then our data is not update there so instead of adding observer in onCreate we <br>
add in onActivityCreated() we also can't add it in onCreateView() because it is every destroyed and recreated
