# kotlin-simpay-api

## SMS
### Weryfikacja kodu
```kotlin
val sms: Sms =  Sms()

val request: CodeVerifyRequest = CodeVerifyRequest()
val request: CodeVerifyRequest = CodeVerifyRequest("code", "key", "secret", "number", "service_id")
request.code = "code" // can be omitted  by passing value in constructor
request.key = "key" // can be omitted  by passing value in constructor
request.secret ="secret" // can be omitted  by passing value in constructor
request.number = "number"
request.service_id = "service_id"

val response: APIResponse<CodeVerifyResponse> = sms.verifyCode(request)
val error: Array<String> = response.error // List of errors, if request was successful list will be empty
val codeVerifyResponse: CodeVerifyResponse = response.respond
val from: String = codeVerifyResponse.from // Sender number
val number: Int = codeVerifyResponse.number // Number where sms were sent
val status: String = codeVerifyResponse.status // Status received from api
val test: Int = codeVerifyResponse.test // 1 if sms was test else 0
val value: Int = codeVerifyResponse.value // Code Value
```

### Pobieranie listy usług
```kotlin
val sms: Sms =  Sms()

val request: ServiceListRequest =  ServiceListRequest()
val request: ServiceListRequest =  ServiceListRequest("key", "secret")

request.key = "key" // can be omitted  by passing value in constructor
request.secret = "secret" // ca
// n be omitted  by passing value in constructor
val response: APIResponse<ServicesResponse> = sms.getServiceList(request)
val error: Array<String> = response.error // List of errors, if request was successful list will be empty
val serviceList: ServicesResponse = response.respond
val status: String = serviceList.status // Status received from api
val services: Array<Service> = serviceList.services // List of services
```

## SMS XML
```kotlin
val smsXml: SmsXml =  SmsXml("apikey")

val code: String = smsXml.generateCode() // Generate code
val number: Int = smsXml.getSmsValue("number") // retrieve information"s about sms
val sms: String = smsXml.generateXml("sms") // Generate xml from sms message
val ip: boolean = smsXml.getServersIp("ip") // Check if passed ip is valid ip of simpay servers
```

## Direct Billing
### Generowanie transakcji
```kotlin
val directBilling: DirectBilling =  DirectBilling()
val directBilling: DirectBilling =  DirectBilling("apiKey", "secret", false, "1")

val request: DbGenerateRequest =  DbGenerateRequest()
val request: DbGenerateRequest = DbGenerateRequest("serviceId", "control", 
                                                   "complete", "failure", 
                                                   "amount", "amount_gross", 
                                                   "amount_required", Operator.ORANGE, "sing")

request.amount = "amount" // can be omitted  by passing value in constructor
request.amount_gross = "amount_gross" // can be omitted  by passing value in constructor
request.amount_required = "amount_required" // can be omitted  by passing value in constructor
request.complete = "complete" // can be omitted  by passing value in constructor
request.failure = "failure" // can be omitted  by passing value in constructor
request.provider = Operator.ORANGE // orange, play, t-mobile, plus-gsm ,can be omitted  by passing value in constructor
request.control = "control" // can be omitted  by passing value in constructor
request.serviceId = "1" // can be omitted  by passing value in constructor

val dbGenerateResponse: DbGenerateResponse = directBilling.generateTransaction(request)
val dbGenerateResponse.link // Link
val dbGenerateResponse.name // Transaction Name
val dbGenerateResponse.status // Status received from api
```

### Pobieranie danych o transakcji
```kotlin
val directBilling: DirectBilling  =  DirectBilling()
val directBilling: DirectBilling  =  DirectBilling("apiKey", "secret", "serviceId")

val request: DbTransactionRequest =  DbTransactionRequest()
val request.id = 1 // can be omitted  by passing value in constructor
val request.key = "key" // can be omitted  by passing value in constructor
val request.secret = "secret"  // can be omitted  by passing value in constructor

val response: APIResponse<DbTransaction>  = directBilling.getTransaction(request)
val error: Array<String> = response.error // List of errors, if request was successful list will be empty
val respond: DbTransaction = response.respond // can be omitted  by passing value in constructor
```

### Pobieranie listy usług DCB
```kotlin
val directBilling: DirectBilling  =  DirectBilling()

val request: DbServicesListRequest =  DbServicesListRequest()
request.api = "key" // can be omitted  by passing value in constructor
request.secret = "secret"  // can be omitted  by passing value in constructor

val response: APIResponse<DbServicesListResponse> = directBilling.getServices(request)
val error: Array<String> = response.error // List of errors, if request was successful list will be empty
val respond: DbTransaction = response.respond
```

### Pobieranie maksymalnych kwot transakcji
```kotlin
val directBilling: DirectBilling =  DirectBilling()

val request: DbTransactionLimitsRequest =  DbTransactionLimitsRequest()
val request: DbTransactionLimitsRequest =  DbTransactionLimitsRequest("key", "secret", "serviceId")

request.service_id = "1" // can be omitted  by passing value in constructor
request.api = "key" // can be omitted  by passing value in constructor
request.secret = "secret"  // can be omitted  by passing value in constructor

val response: APIResponse<Array<DbTransactionLimit>> = directBilling.getTransactionLimits(request)
```

### Pobieranie prowizji dla usługi
```kotlin
val directBilling: DirectBilling = DirectBilling()

val request: DbServiceCommissionRequest =  DbServiceCommissionRequest()
val request: DbServiceCommissionRequest =  DbServiceCommissionRequest("key", "secret", "serviceId")


request.service_id = "1" // can be omitted  by passing value in constructor
request.key = "key" // can be omitted  by passing value in constructor
request.secret = "secret"  // can be omitted  by passing value in constructor

val response: Array<DbCommission> = directBilling.getServiceCommission(request)
```

### Pobieranie adresów IP serwerów SimPay
```kotlin
val directBilling: DirectBilling = DirectBilling()

val response: Array<String> = directBilling.getServersIp()
```

### Obliczanie podpisu sign
```kotlin
val directBilling: DirectBilling = DirectBilling()

val sign: String = directBilling.sign(123, "status", "valuenet", "valuepartner", "control")
```
