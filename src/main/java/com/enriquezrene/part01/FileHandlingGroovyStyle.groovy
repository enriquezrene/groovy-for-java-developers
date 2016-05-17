package com.enriquezrene.part01

/**
 * Created by moe on 5/16/16.
 */
class FileHandlingGroovyStyle {

    public static void main(String[] args) {
        def number = 0
        new File('src/main/resources/com/enriquezrene/part01/file-demo.txt').eachLine {
            line ->
                number++
                println "$number: $line"
        }
    }

}
