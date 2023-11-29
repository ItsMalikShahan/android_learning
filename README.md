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
<br>
<h1>20-25/11/2023</h1>
<br>
Try to fix error of viewModelProvider. Try to find it's solution from chatgpt, stackoverflow, and youtube.<br>
and try to find a solution in the document of android documentation. applied different dependency to solve this situation.
<br>
<h1>28/11/2023</h1>
<br>Worked on project provided assign by digimaster and try to fix gradle error and solved with the help of internet
<br> further i met with ndk error although i have updated ndk version but still it not updated ndk version. so i quit.
<br>
<h1>29/11/2023</h1>
<br><h4>Bottom Navigation</h4>
<br>Added navigation in activity and added different fragments and when user click this navigation button that fragment
<br> is transaction done in activity.
<br><h4>Dialog to Activity</h4>
<br>Added an activity with two textview and a button, on click of that button dialog open and this has a custom dialog
<br>which has two edittext and that data pass to activity and set in textview
