import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-publicacinvistaadministrador')
export class VistaPublicacinvistaadministrador extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout5">
 <vaadin-horizontal-layout theme="spacing" id="publicacion" style="width: 100%; padding: var(--lumo-space-xl); height: 50%;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout4" style="height: 50%; width: 100%; padding: var(--lumo-space-xl);">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; align-self: stretch;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="width: 20%;"></vaadin-vertical-layout>
   <vaadin-button id="borrar" style="align-self: center;" tabindex="0">
    Borrar Comentario
   </vaadin-button>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 20%;"></vaadin-vertical-layout>
   <vaadin-button id="ban" style="align-self: center;" tabindex="0">
    Ban Usuario
   </vaadin-button>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 20%;"></vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; height: 100%; align-self: center;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="align-self: center; width: 100%;">
    <vaadin-button id="inicio" style="align-self: center;" tabindex="0">
     Inicio 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
