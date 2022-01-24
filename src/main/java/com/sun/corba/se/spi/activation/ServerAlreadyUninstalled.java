package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerAlreadyUninstalled.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /scratch/jenkins/workspace/8-2-build-glinux-aarch64/jdk8u321/2141/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, December 15, 2021 7:30:47 PM GMT
*/

public final class ServerAlreadyUninstalled extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerAlreadyUninstalled ()
  {
    super(ServerAlreadyUninstalledHelper.id());
  } // ctor

  public ServerAlreadyUninstalled (int _serverId)
  {
    super(ServerAlreadyUninstalledHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyUninstalled (String $reason, int _serverId)
  {
    super(ServerAlreadyUninstalledHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyUninstalled