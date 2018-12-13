# Azure Active Directory B2C: Advance scenarios

Samples for several Azure AD B2C advance scenarios 

- [SAML RP](policies/saml-relying-party)  This document walk you through adding a SAML-based Relying party to Azure AD B2C. 

- [Azure AD B2C Invitation](policies/invite)  This sample console app demonstrates how to send sign-up email invitation. After you sent the invention, user clicks on a **Confirm account** link, which opens the sign-up page (without the need to validate the email again). Use this approach when need to create the uses account by yourself, while letting the user to choose the password. This approach is more recommended than creating an account via Graph API and sending the password to the user. 

- [Sing-up with social and local account](policies/sign-up-with-social-and-local-account) - Demonstrate how to create a policy that allows user to sign-up with a social account linked to local account

- [Force password reset first logon](policies/force-password-reset-first-logon) - Demonstrates how to force user to reset password on the first logon.  

- [Force password after 90 days](policies/force-password-reset-after-90-days) - Demonstrates how to force user to reset password after 90 days from the last time user sets the password.  
 
- [Dynamic identity provider selection](policies/idps-filter)  Demonstrates how to dynamically filter the list of social identity providers render to the user based on application ID. In the following screenshot user can select from the list of identity providers, such as Facebook, Google+ and Amazon. With Azure AD B2C custom policies, you can configure the technical profiles to be displayed based a claim's value. The  claim value contains the list of identity provider to be rendered.

- [Password reset only](policies/password-reset-only) - This example policy prevents the user form issuing an access token after resetting the password.

- [Edit MFA phone number](policies/edit-mfa-phone-number) - Demonstrates how to allow user to provide and validate new MFA phone number. After user change the MFA phone number, on the next login, user needs to provide the new phone number instead of the old one.

- [Home Realm Discovery page](policies/home-realm-discovery-page) - Demonstrates how to create home realm discovery page. On the sign-in page user provides the sign-in email address and clicks continue. B2C checks the domain portion of the sign-in email address. If the domain name is `contoso.com` the user is redirected to Contoso.com Azure AD to complete the sign-in. Otherwise the user continues the sign-in with user name and password. In both cases (AAD B2C local account and AAD account), the user dons't need to retype the user name. 

- [Username discovery](policies/username-discovery) - This example shows how to discover username by email address. It's useful when a user forgot the username and remember only the email address.

- [Integrate REST API claims exchanges and input validation](policies/rest-api-integration) - A sample .Net core web API, demonstrate the use of [Restful technical profile](https://docs.microsoft.com/en-us/azure/active-directory-b2c/restful-technical-profile) in user journey's orchestration step and as a [validation technical profile](https://docs.microsoft.com/en-us/azure/active-directory-b2c/validation-technical-profile).

- [TOTP multi-factor authentication](policies/custom-mfa-totp) - Custom MFA solution, based on TOTP code. Allowing users to sign-in with Microsoft or Google authenticator apps.

- [Remote profile](policies/remote-profile) - Demonstrates how to store and read user profile in a remote database. 