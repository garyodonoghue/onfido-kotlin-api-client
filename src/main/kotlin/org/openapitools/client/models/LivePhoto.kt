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


/**
 * 
 * @param id The unique identifier for the photo.
 * @param createdAt The date and time at which the photo was uploaded.
 * @param href The uri of this resource.
 * @param downloadHref The uri that can be used to download the photo.
 * @param fileName The name of the uploaded file.
 * @param fileSize The size of the file in bytes.
 * @param fileType The file type of the uploaded file.
 */
data class LivePhoto (
    /* The unique identifier for the photo. */
    val id: kotlin.String? = null,
    /* The date and time at which the photo was uploaded. */
    val createdAt: java.time.LocalDateTime? = null,
    /* The uri of this resource. */
    val href: kotlin.String? = null,
    /* The uri that can be used to download the photo. */
    val downloadHref: kotlin.String? = null,
    /* The name of the uploaded file. */
    val fileName: kotlin.String? = null,
    /* The size of the file in bytes. */
    val fileSize: kotlin.Int? = null,
    /* The file type of the uploaded file. */
    val fileType: kotlin.String? = null
) {

}

