package exception

import java.lang.RuntimeException

class ApiException(message: String?) : RuntimeException(message)
