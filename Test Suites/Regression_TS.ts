<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Regression_TS</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>7ec5a0da-5a0e-4d05-9b6d-4b66dfe35ed6</testSuiteGuid>
   <testCaseLink>
      <guid>8cf06e15-f357-4ff7-a5f8-c0bc16415f1c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>eb5593b7-7dc9-4528-9436-bd97d13e234d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/OrderPlacement</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>2d333855-09f0-4603-a2a7-6805d8a5ded0</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/CSV_OrdCreation</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>2d333855-09f0-4603-a2a7-6805d8a5ded0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>quantity</value>
         <variableId>54f65389-84f2-4e43-8538-514f1eb4dfc5</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
