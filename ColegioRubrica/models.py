from odoo import fields, models, api

class Alumno(models.Model):
    _name = "colegio.alumno"
    name = fields.Char(string="Nombre")
    edad = fields.Integer(string="Edad")
    altura = fields.Integer(string="Altura")
    peso = fields.Integer(string="Peso")
    imc = fields.Integer(string="Calculo de masa corporal")
    genero = fields.Selection([("M", "Masculino"), ("F", "Femenino")])
    clase_id = fields.Many2one("colegio.clase", string="Clase")

    @api.onchange('peso', 'altura')
    def _onchange_price(self):
        self.imc = self.peso * self.altura



class Clase(models.Model):
    _name = "colegio.clase"
    name = fields.Char(string="Nombre de la clase")
    alumno_id = fields.One2many("colegio.alumno", "clase_id", string="Alumno")

class AlumnoEdad(models.Model):
    _inherit = "colegio.alumno"
    _name = "colegio.alumnoedad"

    cuenta = fields.Integer(string="Resultado")

    @api.onchange('peso', 'edad')
    def _onchange_price(self):
        self.cuenta = (self.peso + self.edad)/2

    
    @api.onchange('peso', 'altura')
    def _onchange_price(self):
        self.imc = self.peso * self.altura
