# Azure AD B2C: Integrate REST API claims exchanges and input validation

With the Identity Experience Framework, which underlies Azure Active Directory B2C (Azure AD B2C), you can integrate with a RESTful API in a user journey. This sample .Net core web API, demonstrate the use of [Restful technical profile](https://docs.microsoft.com/en-us/azure/active-directory-b2c/restful-technical-profile) in user journey's orchestration step and as a [validation technical profile](https://docs.microsoft.com/en-us/azure/active-directory-b2c/validation-technical-profile)

## Integrate REST API claims exchanges in your Azure AD B2C user journey as an orchestration step
In the **SignUpOrSignIn** user journey step number 7, Azure AD B2C makes a call to the **REST-GetLoyaltyNumber** technical profile. This  technical profile returns a random loyalty number. The  **SignUpOrSignIn** relying party policy returns **loyaltyNumber** claim to the relying party application.


## Validate user email during sign-up 
The **LocalAccountSignUpWithLogonEmail** is configured to add the **REST-ValidateEmail** validation technical profile (before the AAD-UserWriteUsingLogonEmail). Make sure to keep this order, because you want to: first validate the user input, then create the account in the directory.

The validation technical profile, simply checks if the email address provided by the user, starts with 'test'. If yes, the REST API returns the error, preventing the user from creating the account. Otherwise the REST API return the email in lower case. 


## Disclaimer
The sample is developed and managed by the open-source community in GitHub. The application is not part of Azure AD B2C product and it's not supported under any Microsoft standard support program or service. The sample (Azure AD B2C policy and any companion code) is provided AS IS without warranty of any kind.

> Note:  This sample policy is based on [SocialAndLocalAccounts starter pack](https://github.com/Azure-Samples/active-directory-b2c-custom-policy-starterpack/tree/master/SocialAndLocalAccounts). All changes are marked with **Demo:** comment inside the policy XML files. Make the nessacery changes in the **Demo action required** sections.
