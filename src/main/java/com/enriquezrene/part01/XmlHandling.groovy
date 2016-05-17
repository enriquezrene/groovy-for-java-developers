package com.enriquezrene.part01

/**
 * Created by moe on 5/16/16.
 */
class XmlHandling {

    public static void main(String[] args) {
        def customers = new XmlSlurper().parse(new File('src/main/resources/com/enriquezrene/part01/customers.xml'))
        for (customer in customers.corporate.customer) {
            println "${customer.@name} works for ${customer.@company}"
        }
    }
}
