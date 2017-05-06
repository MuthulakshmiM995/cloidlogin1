/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createlogin;

/**
 *
 * @author HP
 */
public class user{
    private String username;
    private String files;


public user(String username,String files)
{
this.username = username;
this.files = files;
}

public String getusername()
{
return username;
}

public String getfiles()
{
    return files;
}
}
