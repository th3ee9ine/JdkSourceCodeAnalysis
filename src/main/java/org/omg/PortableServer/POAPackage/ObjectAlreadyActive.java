package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/ObjectAlreadyActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /scratch/jenkins/workspace/8-2-build-glinux-aarch64/jdk8u321/2141/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, December 15, 2021 7:30:49 PM GMT
*/

public final class ObjectAlreadyActive extends org.omg.CORBA.UserException
{

  public ObjectAlreadyActive ()
  {
    super(ObjectAlreadyActiveHelper.id());
  } // ctor


  public ObjectAlreadyActive (String $reason)
  {
    super(ObjectAlreadyActiveHelper.id() + "  " + $reason);
  } // ctor

} // class ObjectAlreadyActive
