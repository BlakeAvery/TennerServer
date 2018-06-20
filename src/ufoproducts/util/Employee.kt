package ufoproducts.util

/**
 * This class is meant to be a class that stores employees. All fields are
 * public.
 */

data class Employee(var name: String, var id: Int, var isManager: Boolean) {
    override fun toString(): String {
        return if (isManager) "$name [MANAGER]" else name
    }
}
