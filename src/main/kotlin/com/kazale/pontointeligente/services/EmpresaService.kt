package com.kazale.pontointeligente.services

import com.kazale.pontointeligente.documents.Empresa

interface EmpresaService {

  fun buscarPorCnpj(cnpj: String): Empresa?

  fun persistir(empresa: Empresa): Empresa

}