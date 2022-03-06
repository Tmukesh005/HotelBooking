package org.stepdefinition;

import org.baseadactin.BaseAdactin;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseAdactin {
@Before
public void b_Launch() {
	browse_Launch();
}
@After
public void c_Launch() {
	cLaunch();
}
}
