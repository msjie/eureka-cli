package cn.yusite.example.spring.cloud.eureka.cli

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaCliApplication

fun main(args: Array<String>) {
	runApplication<EurekaCliApplication>(*args)
}
