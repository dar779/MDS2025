import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listafijadetweetsadministrador')
export class VistaListafijadetweetsadministrador extends LitElement {
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
<vaadin-vertical-layout id="vaadinVerticalLayout1" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 15%;">
   <vaadin-button id="Imagen" style="width: 80%; margin: var(--lumo-space-m); height: 15%;" tabindex="0">
     Imagen 
   </vaadin-button>
   <vaadin-button id="cerrarSesion" style="margin: var(--lumo-space-m);" tabindex="0">
     Cerrar Sesion 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout3" style="width: 90%;">
   <vaadin-vertical-layout id="lista" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
   <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="width: 100%; height: 20%; align-self: center;">
    <vaadin-vertical-layout id="vaadinVerticalLayout2" style="align-self: center; width: 100%;">
     <vaadin-button id="masTweets" style="align-self: center;" tabindex="0">
      Mostrar Más
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
