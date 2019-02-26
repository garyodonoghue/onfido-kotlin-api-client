/**
* Onfido API
* The Onfido API is used to submit check requests.
*
* OpenAPI spec version: 2.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.CheckCommon

/**
 * 
 * @param id The unique identifier for the check. Read-only.
 * @param createdAt The date and time when this check was created. Read-only.
 * @param href The uri of this resource. Read-only.
 * @param status The current state of the check in the checking process. Read-only.
 * @param result The overall result of the check, based on the results of the constituent reports. Read-only.
 * @param downloadUri A link to a PDF output of the check results. Append `.pdf` to get the pdf file. Read-only.
 * @param formUri A link to the applicant form, if the check is of type `standard`. Read-only.
 * @param redirectUri For `standard` checks, redirect to this URI when the applicant has submitted their data. Read-only.
 * @param resultsUri A link to the corresponding results page on the Onfido dashboard.
 * @param type The type of the check, `standard` or `express`.
 * @param reportTypeGroups Array containing ids of the Report type groups being requested for. Write-only.
 * @param tags Array of tags being assigned to this check.
 * @param suppressFormEmails For standard checks, applicant form will not be automatically sent if this is set to true. You can manually send the form at any time after the check has been created, using the link found in the form_uri attribute of the check object. Write-only. 
 * @param chargeApplicantForCheck For standard checks, applicants will be presented with a mandatory payment screen before they can submit the applicant form, if this is set to true. In this case, your account will not be charged. Write-only. 
 * @param brandId ID of the brand under which the check should be conducted. Write-only.
 * @param async If this is set to true, we will queue checks for processing and return a response immediately. You can configure webhooks to notify you when the report is complete. Write-only. 
 * @param reports An array of report ids.
 */
data class CheckWithReportIds (
    /* The unique identifier for the check. Read-only. */
    val id: kotlin.String? = null,
    /* The date and time when this check was created. Read-only. */
    val createdAt: java.time.LocalDateTime? = null,
    /* The uri of this resource. Read-only. */
    val href: kotlin.String? = null,
    /* The current state of the check in the checking process. Read-only. */
    val status: kotlin.String? = null,
    /* The overall result of the check, based on the results of the constituent reports. Read-only. */
    val result: kotlin.String? = null,
    /* A link to a PDF output of the check results. Append `.pdf` to get the pdf file. Read-only. */
    val downloadUri: kotlin.String? = null,
    /* A link to the applicant form, if the check is of type `standard`. Read-only. */
    val formUri: kotlin.String? = null,
    /* For `standard` checks, redirect to this URI when the applicant has submitted their data. Read-only. */
    val redirectUri: kotlin.String? = null,
    /* A link to the corresponding results page on the Onfido dashboard. */
    val resultsUri: kotlin.String? = null,
    /* The type of the check, `standard` or `express`. */
    val type: kotlin.String? = null,
    /* Array containing ids of the Report type groups being requested for. Write-only. */
    val reportTypeGroups: kotlin.Array<kotlin.String>? = null,
    /* Array of tags being assigned to this check. */
    val tags: kotlin.Array<kotlin.String>? = null,
    /* For standard checks, applicant form will not be automatically sent if this is set to true. You can manually send the form at any time after the check has been created, using the link found in the form_uri attribute of the check object. Write-only.  */
    val suppressFormEmails: kotlin.Boolean? = null,
    /* For standard checks, applicants will be presented with a mandatory payment screen before they can submit the applicant form, if this is set to true. In this case, your account will not be charged. Write-only.  */
    val chargeApplicantForCheck: kotlin.Boolean? = null,
    /* ID of the brand under which the check should be conducted. Write-only. */
    val brandId: kotlin.String? = null,
    /* If this is set to true, we will queue checks for processing and return a response immediately. You can configure webhooks to notify you when the report is complete. Write-only.  */
    val async: kotlin.Boolean? = null,
    /* An array of report ids. */
    val reports: kotlin.Array<kotlin.String>? = null
) {

}

