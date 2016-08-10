1. Drop the below message into the "TestingOneWay" Queue.

<Employees>
<Employee>
<EmpName>Prakash</EmpName>
<EmpId>1</EmpId>
<EmpDept>101</EmpDept>
<EmpStatus>Active</EmpStatus>
</Employee>
<Employee>
<EmpName>Chella</EmpName>
<EmpId>2</EmpId>
<EmpDept>101</EmpDept>
<EmpStatus>Active</EmpStatus>
</Employee>
</Employees>

	Check the message transfered from TestingOneWay to "TestingPost".
	Check the work flow available in the "activemq_Post".


 2.Drop the below message into the "TestingReqResp" Queue. 
 
 <Employees>
<Employee>
<EmpName>Prakash</EmpName>
<EmpId>1</EmpId>
<EmpDept>101</EmpDept>
<EmpStatus>Active</EmpStatus>
</Employee>
<Employee>
<EmpName>Chella</EmpName>
<EmpId>2</EmpId>
<EmpDept>101</EmpDept>
<EmpStatus>Active</EmpStatus>
</Employee>
</Employees>