# Azure Active Directory B2C: Advance scenarios

Samples for several Azure AD B2C advance scenarios 

- [Sing-up with social and local account](policies/sign-up-with-social-and-local-account) - Demonstrate how to create a policy that allows user to sign-up with a social account linked to local account

- [Force password reset first logon](policies/force-password-reset-first-logon) - Demonstrates how to force user to reset password on the first logon.  
 
- [Password reset only](policies/password-reset-only) - This example policy prevents the user form issuing an access token after resetting the password.

- [Edit MFA phone number](policies/edit-mfa-phone-number) - Demonstrates how to allow user to provide and validate new MFA phone number. After user change the MFA phone number, on the next login, user needs to provide the new phone number instead of the old one.

- [Home Realm Discovery page](policies/home-realm-discovery-page) - Demonstrates how to create home realm discovery page. On the sign-in page user provides the sign-in email address and clicks continue. B2C checks the domain portion of the sign-in email address. If the domain name is `contoso.com` the user is redirected to Contoso.com Azure AD to complete the sign-in. Otherwise the user continues the sign-in with user name and password. In both cases (AAD B2C local account and AAD account), the user dons't need to retype the user name. 