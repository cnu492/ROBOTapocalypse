# ROBOTapocalypse
1.saveSurvivor:
      method: post
      url : http://localhost:8081/v1/saveSurvivor
      request:
	      {
	"name" : "test20",
	"age"  : 32,
	"gender" :"male",
	"lastLocation" :"chennai",
	"flag" :"noninfected"
	}

2.list Of InfectedSurvivors :
       method :GET
       url    :http://localhost:8081/v1/listOfSurvivors/infected
	

3.list Of Non-InfectedSurvivors :
        method : GET
		url    : http://localhost:8081/v1/listOfSurvivors/noninfected
		

4.Percentage of InfectedSurvivors :
         method : GET
         url    :http://localhost:8081/v1/survivorsPercentage/infected
		 
		 
5.Percentage of NON-InfectedSurvivors:
         method  :GET
         url      :http://localhost:8081/v1/survivorsPercentage/noninfected

6.list of robots :
         method : GET
         url    : http://localhost:8081/v1/getAllRobots		 
		 
 
