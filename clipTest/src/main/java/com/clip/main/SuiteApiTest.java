package com.clip.main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.clip.apiTest.TestAddUser;
import com.clip.apiTest.TestGetList;

@RunWith(Suite.class)

@SuiteClasses({TestGetList.class,TestAddUser.class})

public class SuiteApiTest {

}
