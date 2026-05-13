/**
 * Frida script to hook Filmin's P2P sign generation and API responses.
 * 
 * Usage:
 *   pip3 install frida-tools
 *   frida -U -f com.mgs.carparking -l frida_hook.js --no-pause
 */

Java.perform(function() {
    console.log("[*] Filmin Frida Hook Active");

    // Hook 1: Intercept the HTTP GET request to the P2P verify endpoint
    var OkHttpClient = Java.use("okhttp3.OkHttpClient");
    var Request = Java.use("okhttp3.Request");
    var RequestBuilder = Java.use("okhttp3.Request$Builder");
    
    // Hook the OkHttp call to capture verify URL and response
    try {
        var Call = Java.use("okhttp3.internal.connection.RealCall");
        Call.execute.implementation = function() {
            var req = this.request();
            var url = req.url().toString();
            
            if (url.includes("control?msg=verify")) {
                console.log("\n[VERIFY REQUEST]");
                console.log("  URL: " + url);
                
                var response = this.execute();
                var body = response.peekBody(1024 * 1024).string();
                console.log("  SIGN: " + body);
                console.log("[/VERIFY REQUEST]\n");
                return response;
            }
            
            if (url.includes("vod/info_new")) {
                console.log("\n[API REQUEST]");
                console.log("  URL: " + url);
                
                var response = this.execute();
                var body = response.peekBody(1024 * 1024).string();
                console.log("  RESPONSE (first 500): " + body.substring(0, 500));
                console.log("[/API REQUEST]\n");
                return response;
            }
            
            return this.execute();
        };
    } catch(e) {
        console.log("[!] OkHttp hook error: " + e);
    }

    // Hook 2: Intercept the hls.load() native call
    try {
        var HLS = Java.use("com.pp.hls");
        
        HLS.load.implementation = function(sdkKey, pkgName, param3, path1, path2, domain, param7) {
            console.log("\n[HLS.LOAD]");
            console.log("  SDK Key: " + sdkKey);
            console.log("  Package: " + pkgName);
            console.log("  Param3: " + param3);
            console.log("  Path1: " + path1);
            console.log("  Path2: " + path2);
            console.log("  Domain: " + domain);
            console.log("  Param7: " + param7);
            
            var port = this.load(sdkKey, pkgName, param3, path1, path2, domain, param7);
            console.log("  PORT: " + port);
            console.log("[/HLS.LOAD]\n");
            return port;
        };
        
        HLS.exec.implementation = function(a, b, c) {
            console.log("\n[HLS.EXEC]");
            console.log("  Arg1: " + a);
            console.log("  Arg2: " + b);
            console.log("  Arg3: " + c);
            
            var result = this.exec(a, b, c);
            console.log("  RESULT: " + result);
            console.log("[/HLS.EXEC]\n");
            return result;
        };
    } catch(e) {
        console.log("[!] HLS hook error: " + e);
    }

    // Hook 3: Intercept the MAINVIEWMODEL.o() which receives the sign
    try {
        var MainVM = Java.use("com.mgs.carparking.model.MAINVIEWMODEL");
        MainVM.o.implementation = function(vodId, timestamp, sign) {
            console.log("\n[SIGN RECEIVED]");
            console.log("  VOD ID: " + vodId);
            console.log("  Timestamp: " + timestamp);
            console.log("  SIGN: " + sign);
            console.log("[/SIGN RECEIVED]\n");
            
            return this.o(vodId, timestamp, sign);
        };
    } catch(e) {
        console.log("[!] MainVM hook error: " + e);
    }
    
    // Hook 4: Intercept VideoBean URL setting to capture CDN URLs
    try {
        var VideoBean = Java.use("com.mgs.carparking.entity.VideoBean");
        
        VideoBean.setVod_url.implementation = function(url) {
            console.log("\n[CDN URL SET]");
            console.log("  vod_url: " + url);
            console.log("[/CDN URL SET]\n");
            
            return this.setVod_url(url);
        };
        
        VideoBean.setOrginal_url.implementation = function(url) {
            console.log("\n[ORIGINAL URL SET]");
            console.log("  orginal_url: " + url);
            console.log("[/ORIGINAL URL SET]\n");
            
            return this.setOrginal_url(url);
        };
    } catch(e) {
        console.log("[!] VideoBean hook error: " + e);
    }

    // Hook 5: Intercept getSign in MainActivity
    try {
        var MainActivity = Java.use("com.mgs.carparking.ui.MainActivity");
        MainActivity.getSign.implementation = function(vodId) {
            console.log("\n[GET SIGN CALLED]");
            console.log("  VOD ID: " + vodId);
            console.log("[/GET SIGN CALLED]\n");
            
            return this.getSign(vodId);
        };
    } catch(e) {
        console.log("[!] getSign hook error: " + e);
    }

    console.log("[*] All hooks installed! Play a video to capture URLs.");
});
