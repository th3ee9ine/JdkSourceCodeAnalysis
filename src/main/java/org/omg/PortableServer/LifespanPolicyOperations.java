package org.omg.PortableServer;


/**
* org/omg/PortableServer/LifespanPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /scratch/jenkins/workspace/8-2-build-glinux-aarch64/jdk8u321/2141/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, December 15, 2021 7:30:49 PM GMT
*/


/**
	 * The LifespanPolicy specifies the lifespan of the 
	 * objects implemented in the created POA. The default 
	 * is TRANSIENT.
	 */
public interface LifespanPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
  	 * specifies the policy value
  	 */
  org.omg.PortableServer.LifespanPolicyValue value ();
} // interface LifespanPolicyOperations
