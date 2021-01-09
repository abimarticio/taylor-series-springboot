# Taylor Series Spring Boot

## Overview

An implementation of Taylor Series for Sine, Cosine and Exponential function as Spring Boot application.

## Pre-requisites

This project has the following dependencies,

* Java JDK 11
* Spring Boot 2.3.4

## Usage

To use the Taylor Series Spring Boot app for Sine, Cosine and Exponential functions, we have the following view functions:

* `/taylor-series/cosine` for Cosine. The request parameters for this function are numTerms and value.
* `/taylor-series/exponential` for Exponential. The request parameters for this function are numTerms and value.
* `/taylor-series/sine` for Sine. The request parameters for this function are numTerms and value.

To run this app, we can use Maven:

```buildoutcfg
$ ./mvnw spring-boot:run
```

We can call our API in Python through the following manner,

```python
>>> import requests
>>> r = requests.get("http://localhost:8080/taylor-series/cosine?numTerms=10&value=60")
>>> r.status_code
200
>>> r.text
0.5000000021269722
>>> r = requests.get("http://localhost:8080/taylor-series/exponential?numTerms=10&value=60")
>>> r.text
0.8660253739422824
>>> r = requests.get("http://localhost:8080/taylor-series/sine?numTerms=10&value=60")
>>> r.text
3.2564429289571426E10
```