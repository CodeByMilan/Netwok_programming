/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author Milan
 */
public class CookieExample {

    public static void main(String[] args) {
        //creating cookie manager so that we create concrete implementation of cookie handler
        CookieManager cookiemanager = new CookieManager();
        //geeting cookiestore so that we can now add or remove cookie to the cookiestore for every http request and response
        CookieStore cookiestore = cookiemanager.getCookieStore();
        //creating cookies
        HttpCookie cookie1 = new HttpCookie("c1", "milan");
        HttpCookie cookie2 = new HttpCookie("c2", "sahil");
        HttpCookie cookie3 = new HttpCookie("c3", "prashant");

        //craeting uri for the cookies (for which site we are going to add cookies for )
        URI uri1 = URI.create("http://www.tufohss.edu.np/");
        URI uri2 = URI.create("http://www.hcoe.edu.np/");

        //adding cookie to the cookie store 
        cookiestore.add(uri1, cookie1);
        cookiestore.add(uri2, cookie2);
        cookiestore.add(uri1, cookie3);

        //geeting cookies 
        List cookielist = cookiestore.getCookies();
        System.out.println("the cookies present in the cookiestore are :" + cookielist);

        //removing cookie from cookie store 
        cookiestore.remove(uri2, cookie2);

        //remaining cookieslist 
        List remainingcookielist = cookiestore.getCookies();
        System.out.println("the cookies present in the cookiestore are :" + remainingcookielist);

        //removing all cookies from cookie store 
        cookiestore.removeAll();
        List finalcookielist = cookiestore.getCookies();
        System.out.println("the remaining cookie list:" + finalcookielist);

    }

}
