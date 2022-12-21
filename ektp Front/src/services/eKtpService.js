import http from "../http-common";

class eKtpServices {
  createKK(data) {
    return http.post("/kk/insert", data);
  }

  getAllKK() {
    return http.get("/kk/getAll");
  }

  updateKK(id, data) {
    return http.put(`/kk/update/${id}`, data);
  }

  deleteKK(id) {
    return http.delete(`/kk/delete/${id}`);
  }

  getKKById(id) {
    return http.get(`/kk/getKkById/${id}`);
  }

  createAk(data) {
    return http.post("/ak/insert", data);
  }

  getAllAk() {
    return http.get("/ak/getAll");
  }

  updateAk(id, data) {
    return http.put(`/ak/update/${id}`, data);
  }

  deleteAk(id) {
    return http.delete(`/ak/delete/${id}`);
  }

  deleteAllAk(id_kk) {
    return http.delete(`/ak/deleteAkByIdKk/${id_kk}`);
  }

  getAk(id) {
    return http.get(`/ak/getAkById/${id}`);
  }

  getAkByKk(id_kk) {
    return http.get(`/ak/getAkByIdKk/${id_kk}`);
  }

  updateAkByKk(id_kk, data) {
    return http.put(`/ak/updateKk/${id_kk}`, data);
  }

  registUser(data) {
    return http.post("/user/insert", data);
  }

  loginUser(data) {
    return http.post("/user/getUser", data);
  }

  getAllUser() {
    return http.get("/user/getAllUser");
  }

  getEmail(email) {
    return http.post("/user/getEmail", email);
  }

  deleteUser(id) {
    return http.delete(`/user/delete/${id}`);
  }

  updateUser(id, data) {
    return http.put(`/user/update/${id}`, data);
  }

  getUserById(id) {
    return http.get(`/user/getUserById/${id}`);
  }
}

export default new eKtpServices();
