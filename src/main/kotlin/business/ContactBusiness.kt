package business

import entity.ContactEntity
import repository.ContactRepository

class ContactBusiness {
    private fun validate(name: String, phone: String) {
        if (name.isBlank()) {
            throw Exception("Nome é obrigatório")
        }
        if (phone.isBlank()) {
            throw Exception("Telefone é obrigatório")
        }
    }

    private fun validateDelete(name: String, phone: String) {
        if (name.isBlank() || phone.isBlank()) {
            throw Exception("É necessário selecionar um contatoantes de remover")
        }
    }

    fun getContactCountDescription():String{
        val list = getList()
        return "${list.size} contatos"
    }

    fun save(name: String, phone: String) {

        validate(name, phone)
        val contact = ContactEntity(name, phone)
        ContactRepository.save(contact)

    }

    fun delete(name: String, phone: String) {
        validateDelete(name, phone)
        val contact = ContactEntity(name, phone)
        ContactRepository.delete(contact)
    }

    fun getList(): List<ContactEntity> {
        return ContactRepository.getList()
    }
}