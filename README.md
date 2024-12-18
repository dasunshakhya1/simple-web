## Web-Core
## Browser automation framework with Selenium, Java, and TestNG.

## Table of Contents


- [Installation](#installation)
- [Configurations](#Configurations)
- [Test](#test)
- [Libraries and Dependencies](#libraries)

## Installation
1. Clone the repository:
   ```bash
   git clone git@github.com:dasunshakhya1/simple-web.git
2. Navigate to project **~/simple-web**
3. To install dependencies `mvn install`
4. To run tests `mvn verify`

## Configurations

`src/main/java/core/Configs.java` is the main configuration class. 
- Configs - The main configurations are in **src/main/java/configs/Configs** class.
- Browser - The default is **Chrome**. It is possible to change the default browser by setting an environment variable **BROWSER**.
- Base Url - It is possible to change the default url by setting an environment variable **BASE_URL**.
- Test Data Dir - The default dir is **src/main/resources/testdata**. It is possible to change the default dir by setting an environment variable **TEST_DATA_DIR**.

## Test
To run tests `mvn verify`

## Libraries

| Library                                 | Version   |  
|-----------------------------------------|-----------|
| [TestNG](https://testng.org/)           | 7.10.2 >  |    
| [Gson](https://github.com/google/gson)	 | 2.11.0 >	 | 
| **Web-Core** is a private library.      | 	1.0.0 >	 |
| [Lombok](https://projectlombok.org/)    | 1.18.36 > |
