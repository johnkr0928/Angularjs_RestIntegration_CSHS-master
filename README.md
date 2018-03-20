# Angularjs_RestIntegration_CSHS

#Requirements
1. Node.js server to run the frontend on 9009 port 

2. Apache tomcat server to run the REST API port used 8080

3. Database MySQL

#STEPS TO RUN Underwriters_PolicyHolders Front End App

1. Install "Node" in your machine from "https://nodejs.org/en/download/"

2. Press Win+R

3. Open Command Prompt by entering "cmd".

4. In command prompt navigate to "Underwriters_PolicyHolders" folder of your angular application.

5. Install node package manager (npm) --> npm install

6. Run Node application --> node server
 Message: "server on 9009"
 
7. Open browser and enter the url "http://localhost:9009/"


#STEPS TO RUN REST API Client_StackHolder_System (Backend)

1) Download Project from Git Hub 

2) Extract it to any folder 

3) Import Client_StackHolder_System in eclipse as Import a new maven Project from Existing Repository

4) Change <executable>  path in maven-compiler-plugin and set your pata of javac.exe file, Example -

			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.1</version>
				<configuration>
					<fork>true</fork>
					<executable>C:\Program Files\Java\jdk1.8.0_111\bin\javac.exe</executable>
				</configuration>
			</plugin>

5) Set your Database Port No, Database Name Id and Password in spring-servlet.xml file -

	<bean id="dataSource"
		class="org.springframework.jdbc.datasource.DriverManagerDataSource">
		<property name="driverClassName" value="com.mysql.jdbc.Driver" />
		<property name="url" value="jdbc:mysql://localhost:3306/{DataBaseName}" /> 				<!-- Please Replace your Database Name by {DataBase_Name}   -->
		<property name="username" value="{userName}" /> 							<!-- Please Replace your Database User Name by {USER_NAME}  -->
		<property name="password" value="{password}" /> 							<!-- Please Replace your Database Password by {Password}    -->
	</bean>

6) Right click on Project -> Run As -> Maven Build -> set Goals to " clean install " and hit Run.

7) Right click on Project -> Run As -> Run on Server

#Database Configuration

Open Database -

1) Create DATABASE name_of_your_database_specified_in_spring-servlet.xml

