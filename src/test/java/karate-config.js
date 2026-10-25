function fn() {

    var env = karate.env;

    karate.log('karate.env system property was:', env);

    if (!env) {
        env = 'QA';
    }

    var runwithnewuser = karate.properties['myapp.source'];

    if (!runwithnewuser) {
        runwithnewuser = 'N';
    }

    karate.log('karate.env run with new user:', runwithnewuser);

    var config = {
        env: env,

        myVarName: 'someValue',

        baseurlconduit: 'https://api.realworld.io/api/',

        email: 'patildinesh19@hotmail.com',

        password: 'DD123@dd123',

        randomemailaddress: setrandmoemail(),

        letsshopbaseurl: 'https://rahulshettyacademy.com/api/ecom/'
    };

    if (env == 'dev') {

        config.email = 'patildinesh19@gmail.com';
        config.password = 'DD123@dd123';

    } 
    else if (env == 'QA') {

        config.email = 'patildinesh19@yahh.com';
        config.password = 'Test@123';

        config.letsshopbaseurl =
            'https://rahulshettyacademy.com/api/ecom/';

    } 
    else if (env == 'STG') {

        config.email = 'patildinesh19@hotmail.com';
        config.password = 'DD123@dd123';
    }

    /*
     * Temporarily disable login call while
     * validating configuration.
     */

    /*
    if (runwithnewuser == 'N') {

        var accesstoken =
            karate.callSingle(
                'classpath:Datadriven/login.feature',
                config
            );

        config.accesstoken1 = accesstoken.token;
        config.userdetails = accesstoken.username;

    } 
    else if (runwithnewuser == 'Y') {

        var accesstoken =
            karate.callSingle(
                'classpath:Datadriven/createnewuser.feature',
                config
            );

        config.accesstoken1 = accesstoken.token;
        config.userdetails = accesstoken.username;
    }
    */

    karate.log('FINAL CONFIG:', config);

    return config;


    function setrandmoemail() {

        var uuid =
            Math.random().toString(36).substring(2, 15);

        return 'randomemail_123' + uuid + '@gmail.com';
    }
}