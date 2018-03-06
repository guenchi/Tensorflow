; // --------------------------------------------------------------------------
; // TF_DataType holds the type for a scalar value.  E.g.) one slot in a tensor.
; // The enum values here are identical to corresponding values in types.proto.
; enum TF_DataType
(define TF_FLOAT   1)
(define TF_DOUBLE   2)
(define TF_INT32   3)  ;; Int32 tensors are always in 'host' memory.
(define TF_UINT8   4)
(define TF_INT16   5)
(define TF_INT8   6)
(define TF_STRING   7)
(define TF_COMPLEX64   8)  ;; Single-precision complex
(define TF_COMPLEX   8)    ;; Old identifier kept for API backwards compatibility
(define TF_INT64   9)
(define TF_BOOL   10)
(define TF_QINT8   11)     ;; Quantized int8
(define TF_QUINT8   12)    ;; Quantized uint8
(define TF_QINT32   13)    ;; Quantized int32
(define TF_BFLOAT16   14)  ;; Float32 truncated to 16 bits.  Only for cast ops.
(define TF_QINT16   15)    ;; Quantized int16
(define TF_QUINT16   16)   ;; Quantized uint16
(define TF_UINT16   17)
(define TF_COMPLEX128   18)  ;; Double-precision complex
(define TF_HALF   19)
(define TF_RESOURCE   20)
(define TF_VARIANT   21)

; // --------------------------------------------------------------------------
; // TF_Code holds an error code.  The enum values here are identical to
; // corresponding values in error_codes.proto.
; enum TF_Code
(define TF_OK 0)
(define TF_CANCELLED 1)
(define TF_UNKNOWN 2)
(define TF_INVALID_ARGUMENT 3)
(define TF_DEADLINE_EXCEEDED 4)
(define TF_NOT_FOUND 5)
(define TF_ALREADY_EXISTS 6)
(define TF_PERMISSION_DENIED 7)
(define TF_UNAUTHENTICATED 16)
(define TF_RESOURCE_EXHAUSTED 8)
(define TF_FAILED_PRECONDITION 9)
(define TF_ABORTED 10)
(define TF_OUT_OF_RANGE 11)
(define TF_UNIMPLEMENTED 12)
(define TF_INTERNAL 13)
(define TF_UNAVAILABLE 14)
(define TF_DATA_LOSS 15)

; // TF_AttrType describes the type of the value of an attribute on an operation.
; enum TF_AttrType
(define TF_ATTR_STRING 0)
(define TF_ATTR_INT 1)
(define TF_ATTR_FLOAT 2)
(define TF_ATTR_BOOL 3)
(define TF_ATTR_TYPE 4)
(define TF_ATTR_SHAPE 5)
(define TF_ATTR_TENSOR 6)
(define TF_ATTR_PLACEHOLDER 7)
(define TF_ATTR_FUNC 8)