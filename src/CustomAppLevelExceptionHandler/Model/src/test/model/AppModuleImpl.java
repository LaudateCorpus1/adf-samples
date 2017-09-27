/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;

import test.model.common.AppModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 20 12:25:14 CET 2009
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }

    public void addInformationMessageTest() {
        addWarning(new InformationalMessage("Testing... Please ignore."));
    }
    /**
     * Container's getter for EmpView1.
     * @return EmpView1
     */
    public ViewObjectImpl getEmpView1() {
        return (ViewObjectImpl)findViewObject("EmpView1");
    }
}
